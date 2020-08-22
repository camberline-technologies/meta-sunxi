DESCRIPTION = "Communication package, WiFi, BT, etc"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    linux-firmware \
    iw \
    wpa-supplicant \
    dhcpcd \
    hostapd \
    bluez5 \
    packagegroup-tools-bluetooth \
"
