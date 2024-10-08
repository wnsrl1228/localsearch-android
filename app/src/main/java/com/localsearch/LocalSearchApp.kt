package com.localsearch

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.localsearch.navigation.LocalSearchNavHost
import com.localsearch.util.TokenManager


@Composable
fun LocalSearchApp(navController: NavHostController = rememberNavController()) {
    val tokenManager = TokenManager(LocalContext.current)
    LocalSearchNavHost(navController = navController, tokenManager = tokenManager)
}

@Composable
fun LocalSearchTopAppBar(
    title: String,
    canNavigateBack: Boolean,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    navigateUp: () -> Unit = {},
    onMenuClicked: () -> Unit = {},
    canMenuClicked: Boolean = false,
) {
    CenterAlignedTopAppBar(
        title = { Text(text = title)},
        modifier = modifier,
        scrollBehavior = scrollBehavior,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "뒤로가기"
                    )
                }
            }
        },
        actions = {
            if (canMenuClicked) {
                IconButton(onClick = onMenuClicked) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "메뉴 열기"
                    )
                }
            }
        }
    )
}
