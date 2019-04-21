
LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := gif
LOCAL_SRC_FILES := \
 giflib/dgif_lib.c \
 giflib/egif_lib.c \
 giflib/gifalloc.c \
 giflib/gif_err.c \
 giflib/gif_hash.c \
 giflib/openbsd-reallocarray.c \
 giflib/quantize.c

LOCAL_CFLAGS += \
    -Werror \
    -Wno-format \
    -Wno-sign-compare \
    -Wno-unused-parameter \
    -DHAVE_CONFIG_H \

LOCAL_SDK_VERSION := 8

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
## Main library

LOCAL_STATIC_LIBRARIES := gif

LOCAL_LDFLAGS := -llog -ljnigraphics

LOCAL_C_INCLUDES := \
 giflib

LOCAL_MODULE := framesequence
LOCAL_SRC_FILES := \
 framesequence/BitmapDecoderJNI.cpp \
 framesequence/FrameSequence.cpp \
 framesequence/FrameSequence_gif.cpp \
 framesequence/FrameSequenceJNI.cpp \
 framesequence/JNIHelpers.cpp \
 framesequence/Registry.cpp \
 framesequence/Stream.cpp

ifeq ($(FRAMESEQUENCE_INCLUDE_WEBP),true)
 LOCAL_C_INCLUDES += external/webp/include
 LOCAL_SRC_FILES += FrameSequence_webp.cpp
 LOCAL_STATIC_LIBRARIES += libwebp-decode
endif

LOCAL_CFLAGS += \
    -Wall \
    -Werror \
    -Wno-unused-parameter \
    -Wno-unused-variable \
    -Wno-overloaded-virtual \
    -fvisibility=hidden \

LOCAL_SDK_VERSION := 8

include $(BUILD_SHARED_LIBRARY)