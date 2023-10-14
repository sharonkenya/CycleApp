package com.example.cycleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RentingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_renting)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewBicycles)
        val bicycleList = listOf(
            Bicycle(R.drawable.mountainbike, "Mountain Bike", "60 KES/hour"),
            Bicycle(R.drawable.citybike, "City Bike", "60 KES/hour"),
            Bicycle(R.drawable.electricbike, "Electric Bike", "60 KES/hour"),
            Bicycle(R.drawable.foldingbike, "Folding Bike", "60 KES/hour"),
            Bicycle(R.drawable.bmxbike, "BMX Bike", "60 KES/hour")
        )

        val adapter = BicycleAdapter(bicycleList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.cycleapp.ui.theme.CycleAppTheme
//
//class RentingActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            CycleAppTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CycleAppTheme {
//        Greeting("Android")
//    }
//}