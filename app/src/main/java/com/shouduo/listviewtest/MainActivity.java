package com.shouduo.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
//            "Strawberry", "Cherry", "Mango"};

    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                MainActivity.this, android.R.layout.simple_list_item_1, data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initFruits(){
        Fruit apple = new Fruit("Apple", R.drawable.apple);
        fruitList.add(apple);
        Fruit apricot = new Fruit("Apricot", R.drawable.apricot);
        fruitList.add(apricot);
        Fruit banana = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana);
        Fruit cherry = new Fruit("Cherry", R.drawable.cherry);
        fruitList.add(cherry);
        Fruit kiwi = new Fruit("Kiwi", R.drawable.kiwi);
        fruitList.add(kiwi);
        Fruit lemon = new Fruit("Lemon", R.drawable.lemon);
        fruitList.add(lemon);
        Fruit mango = new Fruit("Mango", R.drawable.mango);
        fruitList.add(mango);
        Fruit orange = new Fruit("Apple", R.drawable.orange);
        fruitList.add(orange);
        Fruit peach = new Fruit("Peach", R.drawable.peach);
        fruitList.add(peach);
        Fruit pear = new Fruit("Pear", R.drawable.pear);
        fruitList.add(pear);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit tomato = new Fruit("Tomato", R.drawable.tomato);
        fruitList.add(tomato);

    }
}
