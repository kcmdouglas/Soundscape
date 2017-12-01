package com.kassdee.soundscape.ui.base;

/**
 * Created by kass on 11/30/17.
 */

interface BaseView {
    void showLoadingView();
    void hideLoadingView();
    void showErrorView(String title, String subtitle);
    void hideErrorView();
}