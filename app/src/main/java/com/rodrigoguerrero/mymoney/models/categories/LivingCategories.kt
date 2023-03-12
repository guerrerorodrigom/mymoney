package com.rodrigoguerrero.mymoney.models.categories

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBalance
import androidx.compose.material.icons.outlined.AssuredWorkload
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Drafts
import androidx.compose.material.icons.outlined.Equalizer
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material.icons.outlined.PhoneAndroid
import androidx.compose.material.icons.outlined.Podcasts
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.Color
import com.rodrigoguerrero.mymoney.R
import com.rodrigoguerrero.mymoney.models.Category

val livingCategories = listOf(
    Category(
        id = 15,
        icon = Icons.Outlined.Call,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_internet
    ),
    Category(
        id = 16,
        icon = Icons.Outlined.Settings,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_services
    ),
    Category(
        id = 17,
        icon = Icons.Outlined.Equalizer,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_utilities
    ),
    Category(
        id = 18,
        icon = Icons.Outlined.Key,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_mortgage
    ),
    Category(
        id = 19,
        icon = Icons.Outlined.Drafts,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_rent
    ),
    Category(
        id = 20,
        icon = Icons.Outlined.CreditCard,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_surcharges
    ),
    Category(
        id = 21,
        icon = Icons.Outlined.Circle,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_other
    ),
    Category(
        id = 22,
        icon = Icons.Outlined.Podcasts,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_broadcaster
    ),
    Category(
        id = 23,
        icon = Icons.Outlined.Bolt,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_energy
    ),
    Category(
        id = 24,
        icon = Icons.Outlined.PhoneAndroid,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_mobile
    ),
    Category(
        id = 25,
        icon = Icons.Outlined.AccountBalance,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_bank
    ),
    Category(
        id = 26,
        icon = Icons.Outlined.AssuredWorkload,
        iconBackground = Color(0xFF3F51B5),
        name = R.string.category_living_insurance
    ),
)
