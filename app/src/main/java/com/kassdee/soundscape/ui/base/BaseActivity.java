package com.kassdee.soundscape.ui.base;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by kass on 11/30/17.
 */

public class BaseActivity extends AppCompatActivity implements BaseView{
    private ProgressBar mProgressBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoadingView() {
        if(mProgressBar == null ) {
            mProgressBar = new ProgressBar(this);
        }

        mProgressBar.setIndeterminate(true);
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoadingView() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showErrorView(String title, String subtitle) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(subtitle)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    @Override
    public void hideErrorView() {

    }
}
