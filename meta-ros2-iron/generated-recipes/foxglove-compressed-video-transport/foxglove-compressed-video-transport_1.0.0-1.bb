# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "foxglove_compressed_video_transport provides a plugin to image_transport for     transparently sending an image stream encoded in foxglove compressed video packets."
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
ROS_AUTHOR = "Bernd Pfrommer"
HOMEPAGE = "http://www.ros.org/wiki/image_transport_plugins"
SECTION = "devel"
LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=4083d50af96f9bddbe68e0de85b0a7db"

ROS_CN = "foxglove_compressed_video_transport"
ROS_BPN = "foxglove_compressed_video_transport"

ROS_BUILD_DEPENDS = " \
    ffmpeg-encoder-decoder \
    foxglove-msgs \
    image-transport \
    pluginlib \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-ros-native \
    ros-environment-native \
"

ROS_EXPORT_DEPENDS = " \
    ffmpeg-encoder-decoder \
    foxglove-msgs \
    image-transport \
    pluginlib \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ffmpeg-encoder-decoder \
    foxglove-msgs \
    image-transport \
    pluginlib \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-clang-format \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/foxglove_compressed_video_transport-release/archive/release/iron/foxglove_compressed_video_transport/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/foxglove_compressed_video_transport"
SRC_URI = "git://github.com/ros2-gbp/foxglove_compressed_video_transport-release;${ROS_BRANCH};protocol=https"
SRCREV = "0cc73b8e8a9c92993f191944dad6492c13e5c32b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
