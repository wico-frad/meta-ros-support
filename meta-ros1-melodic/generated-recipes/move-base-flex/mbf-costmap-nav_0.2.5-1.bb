# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The mbf_costmap_nav package contains the costmap navigation server implementation of Move Base Flex (MBF). The costmap navigation server is bound to the <a href="wiki.ros.org/costmap_2d">costmap_2d</a> representation. It provides the Actions for planning, controlling and recovering. At the time of start MBF loads all defined plugins. Therefor, it loads all plugins which are defined in the lists *planners*, *controllers* and *recovery_behaviors*. Each list holds a pair of a *name* and a *type*. The *type* defines which kind of plugin to load. The *name* defines under which name the plugin should be callable by the actions.           Additionally the mbf_costmap_nav package comes with a wrapper for the old navigation stack and the plugins which inherits from the <a href="wiki.ros.org/nav_core">nav_core</a> base classes. Preferably it tries to load plugins for the new API. However, plugins could even support both <a href="wiki.ros.org/move_base">move_base</a> and <a href="wiki.ros.org/move_base_flex">move_base_flex</a> by inheriting both base class interfaces located in the <a href="wiki.ros.org/nav_core">nav_core</a> package and in the <a href="mbf_costmap_core">mbf_costmap_core</a> package."
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "http://wiki.ros.org/move_base_flex"
SECTION = "devel"
LICENSE = "3-Clause-BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2a17ba6bda1db7ca47fe93a1560e517b"

ROS_CN = "move_base_flex"
ROS_BPN = "mbf_costmap_nav"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    base-local-planner \
    dynamic-reconfigure \
    geometry-msgs \
    mbf-abstract-nav \
    mbf-costmap-core \
    mbf-msgs \
    mbf-utility \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    base-local-planner \
    dynamic-reconfigure \
    geometry-msgs \
    mbf-abstract-nav \
    mbf-costmap-core \
    mbf-msgs \
    mbf-utility \
    move-base \
    move-base-msgs \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    base-local-planner \
    dynamic-reconfigure \
    geometry-msgs \
    mbf-abstract-nav \
    mbf-costmap-core \
    mbf-msgs \
    mbf-utility \
    move-base \
    move-base-msgs \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_costmap_nav/0.2.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mbf_costmap_nav"
SRC_URI = "git://github.com/uos-gbp/move_base_flex-release;${ROS_BRANCH};protocol=https"
SRCREV = "6ec0d519fe87b31df54230ad939099b46f088f46"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
