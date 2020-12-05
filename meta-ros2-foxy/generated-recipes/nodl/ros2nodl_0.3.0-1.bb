# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "CLI tools for NoDL files."
AUTHOR = "Ubuntu Robotics <ubuntu-robotics@lists.launchpad.net>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "nodl"
ROS_BPN = "ros2nodl"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-argcomplete} \
    ament-index-python \
    nodl-python \
    ros2cli \
    ros2pkg \
    ros2run \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-argcomplete} \
    ament-index-python \
    nodl-python \
    ros2cli \
    ros2pkg \
    ros2run \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-argcomplete} \
    ament-index-python \
    nodl-python \
    ros2cli \
    ros2pkg \
    ros2run \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-flake8 \
    ament-lint-auto \
    ament-lint-common \
    ament-mypy \
    python3-pytest \
    python3-pytest-mock \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/nodl-release/archive/release/foxy/ros2nodl/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/ros2nodl"
SRC_URI = "git://github.com/ros2-gbp/nodl-release;${ROS_BRANCH};protocol=https"
SRCREV = "52e4866c415643b36a1ace63f673ae6c3d038d96"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
