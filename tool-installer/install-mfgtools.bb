# This is the code for installing a tools package from a git repository
inherit mel-debian-package

DESCRIPTION = "Mfgtools git install"
DEBIAN_DEPENDS += "libusb-1.0-0-dev libbz2-dev libzstd-dev pkg-config cmake libssl-dev g++ zlib1g-dev"
SRC_URI = "git://github.com/nxp-imx/mfgtools.git;branch=master;protocol=https \
	file://debian"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

