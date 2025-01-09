package com.example.kotlin_journey.chapters


// Sealed classes are used to represent restricted class hierarchies, where a value can have one of the several defined types but cannot have any other type.
// All subclasses of a sealed class must be defined within the same file.

sealed class UIState {
    data object Loading : UIState()
    data class Success(val data: SomeData) : UIState()
    data class Error(val error: String) : UIState()
}

data class SomeData(val content: String)

class UIStateHandler {
    companion object {
        fun handleState(state: UIState) {
            when (state) {
                is UIState.Loading -> println("Loading...")
                is UIState.Success -> println("Success with data: ${state.data.content}")
                is UIState.Error -> println("Error: ${state.error}")
            }
        }
    }
}

fun main() {
    UIStateHandler.handleState(UIState.Loading)
    Thread.sleep(1000)
    UIStateHandler.handleState(UIState.Success(SomeData("Data loaded successfully!")))
}
