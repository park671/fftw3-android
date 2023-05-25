cmake_minimum_required(VERSION 3.22.1)

project("fftw")

file(GLOB_RECURSE SRC
        "*.cpp" "*.c"
        "api/*.c"
        "dft/*.c"
        "dft/scalar/*.c"
        "dft/scalar/codelets/*.c"
        "kernel/*.c"
        "libbench2/*.c"
        "rdft/*.c"
        "rdft/scalar/*.c"
        "rdft/scalar/r2cb/*.c"
        "rdft/scalar/r2cf/*.c"
        "rdft/scalar/r2r/*.c"
        "reodft/*.c"
        "tests/*.c"
        )

include_directories(api
        dft
        dft/scalar
        dft/scalar/codelets
        kernel
        libbench2
        rdft
        rdft/scalar
        rdft/scalar/r2cb
        rdft/scalar/r2cf
        rdft/scalar/r2r
        reodft
        tests
        .)

add_library( fftw
             SHARED
             fftw.cpp ${SRC})

target_link_libraries(fftw
                        log )
