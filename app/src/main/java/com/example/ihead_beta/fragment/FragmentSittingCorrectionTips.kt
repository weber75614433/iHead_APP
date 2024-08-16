package com.example.ihead_beta.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class FragmentSittingCorrectionTips : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())

        builder.setTitle("Be Aware!!!").setMessage("Please stand up and sit again, and keep your back straight")
            .setPositiveButton("確認") {dialog, id -> }

        return builder.create()
    }

}