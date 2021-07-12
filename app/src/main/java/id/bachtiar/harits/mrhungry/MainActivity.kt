package id.bachtiar.harits.mrhungry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import id.bachtiar.harits.mrhungry.databinding.ActivityMainBinding
import id.bachtiar.harits.mrhungry.detail.DetailActivity
import id.bachtiar.harits.mrhungry.util.Constant
import id.bachtiar.harits.mrhungry.model.Food

class MainActivity : AppCompatActivity(), FoodAdapter.OnItemClickCallback {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.addAll(FoodData.listData)
        showRecyclerList()
    }

    override fun onItemClicked(data: Food) {
        val bundle = Bundle()
        bundle.putParcelable(Constant.Extras.FOOD_DATA, data)
        startNavigationTo(DetailActivity::class.java, bundle)
    }

    private fun showRecyclerList() {
        foodAdapter = FoodAdapter(list)
        foodAdapter.setOnItemClickCallback(this)
        val linearLayoutManager = LinearLayoutManager(this)
        val dividerItemDecoration =
            DividerItemDecoration(binding.rvFoods.context, linearLayoutManager.orientation)

        binding.rvFoods.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = foodAdapter
            addItemDecoration(dividerItemDecoration)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMenu(selectedMenu: Int) {
        when (selectedMenu) {
            R.id.action_about -> {
                startNavigationTo(AboutActivity::class.java, Bundle())
            }
        }
    }

    private fun startNavigationTo(activityTarget: Class<*>, bundle: Bundle) {
        val intent = Intent(this, activityTarget)
        intent.putExtras(bundle)
        startActivity(intent)
        //Todo Animation
    }
}