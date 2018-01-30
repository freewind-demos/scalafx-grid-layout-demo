package my

import scalafx.application
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.Label
import scalafx.scene.layout.GridPane

object Hello extends JFXApp {

  stage = new application.JFXApp.PrimaryStage {
    title.value = "Grid Layout Demo"
    width = 600
    height = 400
    scene = new Scene {
      content = new GridPane {
        add(new Label("Label1"), 0, 0, 1, 1)
        add(new Label("Label2"), 0, 1, 2, 2)
        add(new Label("Label3"), 3, 0, 4, 4)
      }
    }
  }
}
