# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Allows multipoint communication between rosserial      nodes connected to an xbee. All nodes communicate back      to a master xbee connected to a computer running ROS.       This software currently only works with Series 1 Xbees.       This pkg includes python code from the python-xbee project:      http://code.google.com/p/python-xbee/"
AUTHOR = "Paul Bouchier <paul.bouchier@gmail.com>"
ROS_AUTHOR = "Adam Stambler"
HOMEPAGE = "http://ros.org/wiki/rosserial_xbee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosserial"
ROS_BPN = "rosserial_xbee"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    python-pyserial \
    rospy \
    rosserial-msgs \
    rosserial-python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    python-pyserial \
    rospy \
    rosserial-msgs \
    rosserial-python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_xbee/0.8.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosserial_xbee"
SRC_URI = "git://github.com/ros-gbp/rosserial-release;${ROS_BRANCH};protocol=https"
SRCREV = "adc857e1ef095ae36ad3a0bc59c9c74d3a6fe21a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
