DESCRIPTION = "Communication package, WiFi, BT, etc"
LICENSE = "MIT"

include nanopi-neo-air-core.bb

IMAGE_INSTALL_append += "packagegroup-base"
IMAGE_INSTALL_append += "packagegroup-system"
IMAGE_INSTALL_append += "packagegroup-communication"
IMAGE_INSTALL_append += "openssh"

IMAGE_FEATURES += "ssh-server-openssh"

inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P Camberline root;"
