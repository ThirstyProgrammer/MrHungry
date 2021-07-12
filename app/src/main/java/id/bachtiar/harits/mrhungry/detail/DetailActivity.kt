package id.bachtiar.harits.mrhungry.detail

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.bachtiar.harits.mrhungry.R
import id.bachtiar.harits.mrhungry.databinding.ActivityDetailBinding
import id.bachtiar.harits.mrhungry.util.Constant
import id.bachtiar.harits.mrhungry.util.MarginItemDecoration
import id.bachtiar.harits.mrhungry.util.dpToPx
import id.bachtiar.harits.mrhungry.model.*

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var detailAdapter: DetailAdapter
    private var food: Food = Food()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        food = intent.extras?.getParcelable(Constant.Extras.FOOD_DATA) ?: Food()
        setupToolbar()
        setupView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_detail, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun setMenu(selectedMenu: Int) {
        when (selectedMenu) {
            android.R.id.home -> {
                onBackPressed()
            }
            R.id.action_share -> {
                share()
            }
        }
    }

    private fun share() {
        val text =
            getString(R.string.food_share_template, food.name, food.country, food.description)
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, "Bagikan Info!")
        startActivity(shareIntent)
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        if (supportActionBar != null) {
            supportActionBar!!.title = food.name
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }
    }

    private fun setupView() {
        val (items, size) = listFactory()
        detailAdapter = DetailAdapter(items)
        binding.rvDetails.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@DetailActivity)
            adapter = detailAdapter
            if (itemDecorationCount == 0) {
                addItemDecoration(MarginItemDecoration(dpToPx(8), size - 1))
            }
        }
    }

    private fun listFactory(): Pair<ArrayList<BaseRecyclerItem>, Int> {
        val listItem = ArrayList<BaseRecyclerItem>()
        val image = Image(
            DetailAdapter.TYPE_IMAGE,
            food.photo,
            food.country
        )
        listItem.add(image)
        val description = Text(
            DetailAdapter.TYPE_TEXT,
            food.description
        )
        listItem.add(description)
        val ingredientTitle = Text(
            DetailAdapter.TYPE_TITLE,
            "Bahan-bahan"
        )
        listItem.add(ingredientTitle)
        food.ingredients.forEach {
            val ingredient = Text(
                DetailAdapter.TYPE_TEXT,
                it
            )
            listItem.add(ingredient)
        }
        val cookingStepTitle = Text(
            DetailAdapter.TYPE_TITLE,
            "Cara Memasak"
        )
        listItem.add(cookingStepTitle)
        food.cookingStep.forEach {
            val step = TextWithNumber(
                DetailAdapter.TYPE_TEXT_WITH_NUMBER,
                it.number,
                it.description
            )
            listItem.add(step)
        }
        return Pair(listItem, listItem.size)
    }
}