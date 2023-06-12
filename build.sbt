scalaVersion := "3.2.2"
enablePlugins(ScalaNativePlugin, BindgenPlugin)

import bindgen.interface.Binding

bindgenBindings := Seq(
  Binding
    .builder(
      baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "DOtherSide" / "DOtherSide.h",
      "qml"
    )
    .withCImports(
      List(
        "DOtherSide.h",
        "DosIQAbstractItemModelImpl.h",
        "DosQObjectImpl.h",
        "DosIQObjectImpl.h",
        "DosQObjectWrapper.h",
        "DosLambdaInvoker.h",
        "DosQQuickImageProvider.h",
        "DosQAbstractItemModel.h",
        "DosQtCompatUtils.h",
        "DosQAbstractItemModelWrapper.h",
        "DOtherSide.h",
        "DosQDeclarative.h",
        "DOtherSideTypesCpp.h",
        "DosQMetaObject.h",
        "DOtherSideTypes.h",
        "DosQObject.h",
        "Utils.h"
      )
    ).build
)
