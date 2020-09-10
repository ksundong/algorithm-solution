def solution(expression):
    answer = []
    priorities = [
        ('*', '-', '+'),
        ('*', '+', '-'),
        ('+', '-', '*'),
        ('+', '*', '-'),
        ('-', '*', '+'),
        ('-', '+', '*')
    ]

    for priority in priorities:
        answer.append(int(calc(priority, 0, expression)))

    return max(map(abs, answer))


def calc(priority, n, expression):
    if n == 2:
        return str(eval(expression))
    if priority[n] == '*':
        res = eval('*'.join([calc(priority, n + 1, e) for e in expression.split('*')]))
    if priority[n] == '+':
        res = eval('+'.join([calc(priority, n + 1, e) for e in expression.split('+')]))
    if priority[n] == '-':
        res = eval('-'.join([calc(priority, n + 1, e) for e in expression.split('-')]))
    return str(res)


solution('100-200*300-500+20')
