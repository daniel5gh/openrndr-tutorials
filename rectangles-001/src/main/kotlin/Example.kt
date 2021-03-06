import org.openrndr.Application
import org.openrndr.Configuration
import org.openrndr.Program
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector2
import org.openrndr.shape.Circle
import org.openrndr.shape.Rectangle

/**
 * This is a basic example that shows how to draw many rectangles at once.
 */
class Example : Program() {

    var index = 0
    var startTime = System.currentTimeMillis()

    override fun draw() {
        drawer.background(ColorRGBa.BLACK)
        drawer.fill = null
        drawer.stroke = ColorRGBa.WHITE.opacify(0.1)

        drawer.strokeWeight = 2.0



        drawer.rectangle((0..20000).map { Rectangle(Math.random() * width, Math.random() * height, 10.0, 10.0) })
//        //drawer.circles((0..20000).map { Vector2(Math.random()*width, Math.random()*height) }, 10.0)
//        drawer.circles((0..20000).map {
//            Circle(Vector2(Math.random()*width, Math.random()*height), 20.0)
//        })
    }
}

fun main(args: Array<String>) {
    Application.run(Example(), Configuration())
}