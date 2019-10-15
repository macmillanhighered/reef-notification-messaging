BUILD_FILE=./build.gradle
function prop {
    grep "${1}" $BUILD_FILE | cut -d'=' -f2 | tr -d '"' | tr -d ' '
}
echo $(prop "def version")
