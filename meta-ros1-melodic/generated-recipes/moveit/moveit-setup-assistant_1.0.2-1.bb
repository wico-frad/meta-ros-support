# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Generates a configuration package that makes it easy to use MoveIt!"
AUTHOR = "Dave Coleman <dave@picknik.ai>"
ROS_AUTHOR = "Dave Coleman <dave@picknik.ai>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_setup_assistant"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt5-opengl-dev} \
    moveit-core \
    moveit-ros-planning \
    moveit-ros-visualization \
    qtbase \
    rosconsole \
    roscpp \
    rviz \
    srdfdom \
    urdf \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    moveit-ros-visualization \
    rosconsole \
    roscpp \
    rviz \
    srdfdom \
    urdf \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    moveit-ros-visualization \
    rosconsole \
    roscpp \
    rviz \
    srdfdom \
    urdf \
    xacro \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    moveit-resources \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_setup_assistant/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_setup_assistant"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "c52a394d3f9d51a8953539810e2135035f474ebe"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
