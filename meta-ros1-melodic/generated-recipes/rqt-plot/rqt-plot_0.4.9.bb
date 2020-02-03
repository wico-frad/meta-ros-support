# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using different plotting backends."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dorian Scholz"
HOMEPAGE = "http://wiki.ros.org/rqt_plot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_plot"
ROS_BPN = "rqt_plot"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-matplotlib} \
    python-numpy \
    python-qt-binding \
    python-rospkg \
    qt-gui-py-common \
    qwt-dependency \
    rosgraph \
    rostopic \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-matplotlib} \
    python-numpy \
    python-qt-binding \
    python-rospkg \
    qt-gui-py-common \
    qwt-dependency \
    rosgraph \
    rostopic \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt_plot-release/archive/release/melodic/rqt_plot/0.4.9-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_plot"
SRC_URI = "git://github.com/ros-gbp/rqt_plot-release;${ROS_BRANCH};protocol=https"
SRCREV = "0c1609db215f7154c4732fabf515a1d6194e9e20"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
