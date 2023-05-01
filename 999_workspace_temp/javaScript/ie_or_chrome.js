if (navigator.userAgent.indexOf('MSIE') !== -1 || navigator.appVersion.indexOf('Trident/') > 0) {
  // User is using Internet Explorer
  console.log('User is using Internet Explorer');
} else if (navigator.userAgent.indexOf('Chrome') !== -1) {
  // User is using Chrome
  console.log('User is using Chrome');
} else {
  // User is using another browser
  console.log('User is using another browser');
}
