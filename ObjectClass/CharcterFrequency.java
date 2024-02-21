class CharcterFrequency {
public static void main(String[] args) {
String str = "allahaaal";
char[] ch = str.toCharArray();

int n = ch.length;
for (int i = 0; i < n; i++) {
int count = 1;
for (int j = i + 1; j < n; j++) {
if (ch[i] == ch[j]) {
count++;
int k = j;
while (k < n - 1) {
ch[k] = ch[k + 1];
k++;
}
j--;
n--;
}
}
System.out.println(ch[i] + "-->" + count);
}
}
}
