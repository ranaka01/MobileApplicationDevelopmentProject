package com.example.thechef;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.thechef.Adapter.FoodListAdapter;
import com.example.thechef.Domain.RecipeDomain;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterFoodList;
    private RecyclerView recyclerViewRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<RecipeDomain> items = new ArrayList<>();
        items.add(new RecipeDomain("Fish Curry","Cut the fish into large chunks and mix it well with all the marinade ingredients in a medium-sized bowl, then set it aside for an hour to marinate. In a medium saucepan, heat some oil over medium heat and sauté onion, garlic, curry leaves, chili, and fenugreek until softened. Next, add cinnamon, coconut milk, turmeric, chili powder, salt, and pepper, bringing the mixture to a boil. Once boiling, add the well-marinated fish along with tomato or goraka, and let it simmer on low heat until the fish is cooked and the curry thickens. Finally, stir in Dijon mustard, adjust the seasoning, and serve the curry hot with rice.","fishcurry","Cut the fish into large chunks and mix it well with all the marinade ingredients in a medium-sized bowl, then set it aside for an hour to marinate. In a medium saucepan, heat some oil over medium heat and sauté onion, garlic, curry leaves, chili, and fenugreek until softened. Next, add cinnamon, coconut milk, turmeric, chili powder, salt, and pepper, bringing the mixture to a boil. Once boiling, add the well-marinated fish along with tomato or goraka, and let it simmer on low heat until the fish is cooked and the curry thickens. Finally, stir in Dijon mustard, adjust the seasoning, and serve the curry hot with rice.","Cut the fish into large chunks and mix it well with all the marinade ingredients in a medium-sized bowl, then set it aside for an hour to marinate. In a medium saucepan, heat some oil over medium heat and sauté onion, garlic, curry leaves, chili, and fenugreek until softened. Next, add cinnamon, coconut milk, turmeric, chili powder, salt, and pepper, bringing the mixture to a boil. Once boiling, add the well-marinated fish along with tomato or goraka, and let it simmer on low heat until the fish is cooked and the curry thickens. Finally, stir in Dijon mustard, adjust the seasoning, and serve the curry hot with rice.",20,4.5));
        items.add(new RecipeDomain("Meat Curry","","tunacurry","","",25,3.5));
        items.add(new RecipeDomain("Egg Curry","","fast_1","","",40,2.0));
        items.add(new RecipeDomain("Fish Curry","","c1","","",20,4.5));
        items.add(new RecipeDomain("Meat Curry","","fishcurry","","",25,3.5));
        items.add(new RecipeDomain("Egg Curry","","fishcurry","","",40,2.0));

        recyclerViewRecipe = findViewById(R.id.view1);
        recyclerViewRecipe.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapterFoodList=new FoodListAdapter(items);
        recyclerViewRecipe.setAdapter(adapterFoodList);


    }
}