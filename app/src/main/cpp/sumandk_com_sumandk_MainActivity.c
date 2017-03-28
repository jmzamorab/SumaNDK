
#include "../jni/sumandk_com_sumandk_MainActivity.h"

jint Java_sumandk_com_sumandk_MainActivity_calcularSuma (JNIEnv * env, jobject thiz, jint aux1, jint aux2)
   { jint total= (aux1+aux2);
     return total;
   }

