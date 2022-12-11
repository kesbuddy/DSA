function[a,b,c,d] = calc(x,y)
a = x+y;
b = x-y;
c = x/y;
d = x*y;
p = ones(1/10);
for n = 2 : 6;
    if mod(n,2) == 0
        disp(n);
    p(n) = 2*p(n-1);
    end
end
end