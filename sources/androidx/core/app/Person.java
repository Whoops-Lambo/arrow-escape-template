package androidx.core.app;

import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Person {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api22Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
        public static Person a(android.app.Person person) {
            Builder builder = new Builder();
            builder.a = person.getName();
            builder.b = person.getIcon() != null ? IconCompat.a(person.getIcon()) : null;
            builder.c = person.getUri();
            builder.d = person.getKey();
            builder.e = person.isBot();
            builder.f = person.isImportant();
            return builder.a();
        }

        public static android.app.Person b(Person person) {
            android.app.Person.Builder name = new android.app.Person.Builder().setName(person.a);
            IconCompat iconCompat = person.b;
            return name.setIcon(iconCompat != null ? iconCompat.h(null) : null).setUri(person.c).setKey(person.d).setBot(person.e).setImportant(person.f).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;

        public final Person a() {
            Person person = new Person();
            person.a = this.a;
            person.b = this.b;
            person.c = this.c;
            person.d = this.d;
            person.e = this.e;
            person.f = this.f;
            return person;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.d;
        String str2 = person.d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.a), Objects.toString(person.a)) && Objects.equals(this.c, person.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(person.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(person.f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
