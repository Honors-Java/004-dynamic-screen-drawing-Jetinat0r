const label = document.getElementById("color");
const head = document.getElementById("head");

head.addEventListener("click", function () {
    const input = head.value;
    const output = hexToRgb(input);

    label.innerHTML = output.r + ", " + output.g + ", " + output.b;
});

function hexToRgb(hex) {
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: parseInt(result[1], 16),
        g: parseInt(result[2], 16),
        b: parseInt(result[3], 16)
    } : null;
}

