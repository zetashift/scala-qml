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
        "DOtherSide/DosIQAbstractItemModelImpl.h",
        "DOtherSide/DosQObjectImpl.h",
        "DOtherSide/DosIQObjectImpl.h",
        "DOtherSide/DosQObjectWrapper.h",
        "DOtherSide/DosLambdaInvoker.h",
        "DOtherSide/DosQQuickImageProvider.h",
        "DOtherSide/DosQAbstractItemModel.h",
        "DOtherSide/DosQtCompatUtils.h",
        "DOtherSide/DosQAbstractItemModelWrapper.h",
        "DOtherSide/DOtherSide.h",
        "DOtherSide/DosQDeclarative.h",
        "DOtherSide/DOtherSideTypesCpp.h",
        "DOtherSide/DosQMetaObject.h",
        "DOtherSide/DOtherSideTypes.h",
        "DOtherSide/DosQObject.h",
        "DOtherSide/Utils.h"
      )
    )
    .addClangFlag("-I" + baseDirectory.value / "src" / "main" / "resources" / "scala-native")
    .build
)
