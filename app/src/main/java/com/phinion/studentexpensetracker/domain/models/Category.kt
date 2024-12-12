package com.phinion.studentexpensetracker.domain.models

import com.phinion.studentexpensetracker.R

data class Category(
    val icon: Int,
    val name: String
)

fun getCategoryList(): List<Category> {
    return listOf(
        Category(R.drawable.folder, "Monthly Income"),
        Category(R.drawable.earning, "Financial Aid"),
        Category(R.drawable.tuition, "Tuition"),
        Category(R.drawable.home_icon_silhouette, "Housing"),
        Category(R.drawable.restaurant, "Food"),
        Category(R.drawable.bus, "Transportation"),
        Category(R.drawable.open_book, "Books and Supplies"),
        Category(R.drawable.smartphone, "Entertainment"),
        Category(R.drawable.personal_hygiene, "Personal Care"),
        Category(R.drawable.ai, "Technology"),
        Category(R.drawable.healthcare, "Health and Wellness"),
        Category(R.drawable.magic_box, "Miscellaneous")
    )
}
