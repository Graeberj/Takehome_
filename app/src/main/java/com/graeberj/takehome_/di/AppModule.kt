package com.graeberj.takehome_.di

import com.graeberj.takehome_.domain.ItemRepository
import com.graeberj.takehome_.presentation.ItemViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { ItemRepository() }
    viewModel { ItemViewModel(get()) }
}