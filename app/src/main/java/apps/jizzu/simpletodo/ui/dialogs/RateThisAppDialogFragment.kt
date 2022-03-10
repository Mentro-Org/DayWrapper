package apps.jizzu.simpletodo.ui.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import apps.jizzu.simpletodo.R
import apps.jizzu.simpletodo.ui.dialogs.base.BaseDialogFragment
import apps.jizzu.simpletodo.utils.PreferenceHelper
import kotlinx.android.synthetic.main.dialog_rate_this_app.*

class RateThisAppDialogFragment : BaseDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.dialog_rate_this_app, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initButtons()
    }

    private fun initButtons() {
        val preferenceHelper = PreferenceHelper.getInstance()

        tvNeverShow.setOnClickListener {
            preferenceHelper.putBoolean(PreferenceHelper.IS_NEED_TO_SHOW_RATE_DIALOG_LATER, false)
            dismiss()
        }
        tvShowLater.setOnClickListener {
            preferenceHelper.putInt(PreferenceHelper.LAUNCHES_COUNTER, 0)
            dismiss()
        }
    }
}