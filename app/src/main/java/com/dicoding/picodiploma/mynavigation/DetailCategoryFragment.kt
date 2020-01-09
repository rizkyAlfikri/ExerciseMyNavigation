package com.dicoding.picodiploma.mynavigation


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail_category.*


class DetailCategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDescription = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock


        tv_category_name.text = dataName
        tv_category_description.text = "Stock = $dataDescription"

        btn_home.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_detailCategoryFragment_to_homeFragment))
    }


}
