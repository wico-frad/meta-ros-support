# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Wrapper (aka vendor package) around the FMILibrary by Modelon AB (JModelica.org)"
AUTHOR = "Ralph Lange <ralph.lange@de.bosch.com>"
HOMEPAGE = "https://jmodelica.org/"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=665599198b8a9e42fd087c8d041ec61f"

ROS_CN = "fmilibrary_vendor"
ROS_BPN = "fmilibrary_vendor"

ROS_BUILD_DEPENDS = " \
    git \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/fmilibrary_vendor-release/archive/release/galactic/fmilibrary_vendor/1.0.1-2.tar.gz
ROS_BRANCH ?= "branch=release/galactic/fmilibrary_vendor"
SRC_URI = "git://github.com/ros2-gbp/fmilibrary_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "d5dce2c77a7386288b347f3c992d024a4e3c2b1c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
