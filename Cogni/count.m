img = imread("cat.jfif");
subplot(121);imshow(img);title("Original Image");
bw  = im2bw(img);
subplot(122);imshow(bw);title("Binary Image");
[r,c]=size(bw);

[ones,zeroes] = count_BW(img);
disp(['Total No. of pixels: ' num2str(r*c)]);
disp(['No of black Pixels: ' num2str(zeroes)]);
disp(['No of white Pixels: ' num2str(ones)]);
if ones+zeroes == r*c
    disp(['verified']);
else
    disp(['Number of pixels not matching']);
end