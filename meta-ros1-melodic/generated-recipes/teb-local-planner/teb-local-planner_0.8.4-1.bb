# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The teb_local_planner package implements a plugin     to the base_local_planner of the 2D navigation stack.     The underlying method called Timed Elastic Band locally optimizes     the robot's trajectory with respect to trajectory execution time,     separation from obstacles and compliance with kinodynamic constraints at runtime."
AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
ROS_AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
HOMEPAGE = "http://wiki.ros.org/teb_local_planner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "teb_local_planner"
ROS_BPN = "teb_local_planner"

ROS_BUILD_DEPENDS = " \
    base-local-planner \
    cmake-modules \
    costmap-2d \
    costmap-converter \
    dynamic-reconfigure \
    geometry-msgs \
    interactive-markers \
    libg2o \
    mbf-costmap-core \
    mbf-msgs \
    message-generation \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    costmap-converter \
    dynamic-reconfigure \
    geometry-msgs \
    interactive-markers \
    libg2o \
    mbf-costmap-core \
    mbf-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf2 \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    costmap-converter \
    dynamic-reconfigure \
    geometry-msgs \
    interactive-markers \
    libg2o \
    mbf-costmap-core \
    mbf-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf2 \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rst-tu-dortmund/teb_local_planner-release/archive/release/melodic/teb_local_planner/0.8.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/teb_local_planner"
SRC_URI = "git://github.com/rst-tu-dortmund/teb_local_planner-release;${ROS_BRANCH};protocol=https"
SRCREV = "3cbcc0405bb9acf56f5858f5a0ab3920214ed2af"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
