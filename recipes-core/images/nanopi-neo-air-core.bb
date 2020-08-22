include recipes-core/images/core-image-base.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
    kernel-modules \
    "
