package id.sasmita.biodata


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_page02.*
import kotlinx.android.synthetic.main.fragment_page03.*

/**
 * A simple [Fragment] subclass.
 */
class Page02Fragment : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page02, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        buttonPage02.setOnClickListener{
            if (editText.text.toString().isNotEmpty()){
                val input:String = editText.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)

                nav.navigate(R.id.action_page02Fragment_to_page03Fragment,bundle)
            }
        }
    }

}
