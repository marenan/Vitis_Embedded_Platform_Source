SUMMARY  = "Xilinx Runtime(XRT) driver module"
DESCRIPTION = "Xilinx Runtime driver module provides memory management and compute unit schedule"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/Xilinx/XRT.git;protocol=https;branch=2019.2"

PV = "2.2.0+git${SRCPV}"

# Use latest version
SRCREV = "d3756849645e1e28d0f705bc57972620021ab189"

S = "${WORKDIR}/git/src/runtime_src/core/edge/drm/zocl"

inherit module
