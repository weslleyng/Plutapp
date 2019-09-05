package dev.weslley.plutapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.weslley.plutapp.R



/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [ExchangeStockFragmentFragment.OnListFragmentInteractionListener] interface.
 */
class ExchangeStockFragmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exchangestockfragment_list, container, false)
    }



}
