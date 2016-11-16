package com.example.blackmonk.chimeraassignment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by blackmonk on 11/15/2016.
 */

@Singleton
@Component(modules={RetroModule.class})

public interface RetroComponent {

    void inject(MainActivity mainActivity);
}
