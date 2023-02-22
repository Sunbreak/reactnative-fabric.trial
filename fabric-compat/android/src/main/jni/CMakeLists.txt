cmake_minimum_required(VERSION 3.13)
set(CMAKE_VERBOSE_MAKEFILE on)

# Define the library name here.
project(fabriccompat_registration)

include(${REACT_ANDROID_DIR}/cmake-utils/Android-prebuilt.cmake)

file(GLOB input_SRC CONFIGURE_DEPENDS *.cpp)

add_library(${CMAKE_PROJECT_NAME} SHARED ${input_SRC})

target_compile_options(${CMAKE_PROJECT_NAME} PRIVATE -Wall -Werror -fexceptions -frtti -std=c++17 -DWITH_INSPECTOR=1 -DLOG_TAG=\"ReactNative\")

target_link_libraries(${CMAKE_PROJECT_NAME}
        fabricjni
        fbjni
        folly_runtime
        glog
        jsi
        react_codegen_rncore
        react_debug
        react_nativemodule_core
        react_render_componentregistry
        react_render_core
        react_render_debug
        react_render_graphics
        rrc_view
        runtimeexecutor
        turbomodulejsijni
        yoga)

add_subdirectory(${GENERATED_SRC_DIR}/codegen/jni/ RNFabricCompatViewSpec_autolinked_build)

target_link_libraries(${CMAKE_PROJECT_NAME} react_codegen_RNFabricCompatViewSpec)
