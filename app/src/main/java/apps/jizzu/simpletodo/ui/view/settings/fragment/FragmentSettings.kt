package apps.jizzu.simpletodo.ui.view.settings.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import apps.jizzu.simpletodo.R
import apps.jizzu.simpletodo.ui.view.settings.fragment.base.BaseSettingsFragment
import kotlinx.android.synthetic.main.fragment_settings.*

class FragmentSettings : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initButtons()
    }

    private fun initButtons() {
        tvUI.setOnClickListener { openFragment(FragmentUI()) }
        tvNotifications.setOnClickListener { openFragment(FragmentNotifications()) }
        tvDateAndTime.setOnClickListener { openFragment(FragmentDateAndTime()) }
    }

    private fun openFragment(fragment: BaseSettingsFragment) =
            fragmentManager?.beginTransaction()?.replace(R.id.flFragmentContainer, fragment)?.addToBackStack(null)?.commit()
}