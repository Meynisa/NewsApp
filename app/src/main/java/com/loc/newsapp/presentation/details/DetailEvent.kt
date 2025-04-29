package com.loc.newsapp.presentation.details

sealed class DetailEvent {
    object SaveArticle: DetailEvent()
}