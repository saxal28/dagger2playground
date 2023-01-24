package com.example.feature__order.di

import com.example.data__order.di.DataOrderModule
import dagger.Component

@Component(modules = [DataOrderModule::class])
interface FeatureOrderComponent {

}