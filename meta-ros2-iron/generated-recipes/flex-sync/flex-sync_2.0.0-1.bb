# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "ros2 package for syncing variable number of topics"
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "flex_sync"
ROS_BPN = "flex_sync"

ROS_BUILD_DEPENDS = " \
    ament-cmake-clang-format \
    rclcpp \
    rclcpp-components \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-cmake-clang-format \
    rclcpp \
    rclcpp-components \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake-clang-format \
    rclcpp \
    rclcpp-components \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-clang-format \
    ament-cmake-clang-format \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/flex_sync-release/archive/release/iron/flex_sync/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/flex_sync"
SRC_URI = "git://github.com/ros2-gbp/flex_sync-release;${ROS_BRANCH};protocol=https"
SRCREV = "3f956d6b9d1e31fc4d9727a881a17e381d8901a2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
