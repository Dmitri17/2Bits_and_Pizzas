package ru.lepeschko.a2bitsandpizzas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;// закомментированная версия для ListFragment
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter; // используется вместе с ListAdapter
import android.support.v7.widget.GridLayoutManager;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaFragment extends ListFragment {

    public PizzaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       ArrayAdapter<String> adapter = new ArrayAdapter<>(  //версия для ListAdapter
                inflater.getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pizzas));
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);

       /* RecyclerView pizzaRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_pizza, container, false);
        String[] pizzaNames = new String[Pizza.pizzas.length];
        for(int i = 0; i< pizzaNames.length; i++){
            pizzaNames[i]= Pizza.pizzas[i].getName();
        }
        int[] pizzaImages = new int[Pizza.pizzas.length];
        for (int i = 0; i < Pizza.pizzas.length; i++){
            pizzaImages[i] = Pizza.pizzas[i].getImageResourceId();
        }
        CaptionedImageAdapter adapter = new CaptionedImageAdapter(pizzaNames, pizzaImages);
        pizzaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        pizzaRecycler.setLayoutManager(layoutManager);
        return pizzaRecycler;*/
    }
}
