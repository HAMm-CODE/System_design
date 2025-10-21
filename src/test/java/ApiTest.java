import org.example.Api;
import org.example.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApiTest {

    @Test
    void testFetchUserById() {
        Api api = new Api();

        // Fetch user
        User user = api.fetchUserById(1);

        // Assertions
        assertNotNull(user, "user should not be null");
        assertEquals(1, user.getUserId(), "UserId should be 1");
        assertEquals(1, user.getId(), "user ID should be 1");
        assertEquals(
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                user.getTitle(),
                "Title should match"
        );
        assertEquals(
                "quia et suscipit"+'\n'+"suscipit recusandae consequuntur expedita et cum"+'\n'+"reprehenderit molestiae ut ut quas totam"+'\n'+"nostrum rerum est autem sunt rem eveniet architecto",
                user.getBody(),
                "Body should match"
        );
    }
}
