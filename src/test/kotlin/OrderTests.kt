import com.jetbrains.handson.httpapi.module
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

class OrderRouteTests {
    @Test
    fun testGetOrder() {
        withTestApplication({module(testing = true)}) {
            handleRequest(HttpMethod.Get, "order/1").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}
